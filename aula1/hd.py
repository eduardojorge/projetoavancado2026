from memoria_s import MemoriaS


class HD(MemoriaS):

    def __init__(self, numero_serie, total, unidade):
        super().__init__(total, unidade)
        self.__numero_serie = numero_serie

    def get_perda(self):
        return self.get_converte_kb(self.total) / 10240 / 100

    def get_espaco_disponivel_real_kb(self):
        return (
            self.get_espaco_disponivel_kb()
            * (1 - self.get_perda())
        )

    def get_numero_serie(self):
        return self.__numero_serie

    def __str__(self):
        return (
            f"HD - Número de série: {self.__numero_serie} - "
            f"{super().__str__()}"
        )