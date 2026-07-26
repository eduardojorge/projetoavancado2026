from abc import ABC, abstractmethod


class MemoriaS(ABC):

    BYTE = 1
    KB = 2
    MB = 3
    GB = 4

    def __init__(self, total, unidade=KB):
        self.total = total
        self.utilizado_kb = 0
        self.unidade = unidade

    @abstractmethod
    def get_perda(self):
        pass

    @abstractmethod
    def get_espaco_disponivel_real_kb(self):
        pass

    def get_converte_kb(self, valor):
        if self.unidade == self.BYTE:
            valor /= 1024
        elif self.unidade == self.MB:
            valor *= 1024
        elif self.unidade == self.GB:
            valor *= 1024 * 1024

        return valor

    def get_espaco_disponivel_kb(self):
        total_kb = self.get_converte_kb(self.total)
        return total_kb - self.utilizado_kb

    def grava_kb(self, novo_tamanho):
        if self.get_espaco_disponivel_kb() >= novo_tamanho:
            self.utilizado_kb += novo_tamanho
            return True

        return False

    def get_unidade(self):
        unidades = {
            self.BYTE: "BYTE",
            self.KB: "KB",
            self.MB: "MB",
            self.GB: "GB"
        }

        return unidades.get(self.unidade, "Unidade inválida")

    def get_percentual_disponivel(self):
        total_kb = self.get_converte_kb(self.total)

        if total_kb == 0:
            return 0

        return (
            self.get_espaco_disponivel_real_kb()
            / total_kb
            * 100
        )

    def __str__(self):
        return (
            f"Percentual disponível: "
            f"{self.get_percentual_disponivel():.2f}% - "
            f"Espaço total: "
            f"{self.get_converte_kb(self.total):.2f} KB - "
            f"Espaço disponível real: "
            f"{self.get_espaco_disponivel_real_kb():.2f} KB - "
            f"Perda: {self.get_perda():.2f}%"
        )