from memoria_s import MemoriaS


class CD(MemoriaS):

    ABERTO = 1
    FECHADO = 0

    def __init__(self, total, unidade):
        super().__init__(total, unidade)
        self.__estado = self.ABERTO

    def get_perda(self):
        return 0.98

    def get_espaco_disponivel_real_kb(self):
        return (
            self.get_espaco_disponivel_kb()
            * self.get_perda()
        )

    def grava_kb(self, tamanho):
        if self.__estado == self.ABERTO:
            if super().grava_kb(tamanho):
                self.__estado = self.FECHADO
                return True

        return False

    def get_estado(self):
        if self.__estado == self.ABERTO:
            return "ABERTO"

        return "FECHADO"

    def __str__(self):
        return (
            f"CD - Estado: {self.get_estado()} - "
            f"{super().__str__()}"
        )