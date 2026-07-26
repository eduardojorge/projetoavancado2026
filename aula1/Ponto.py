class Ponto:

    def __init__(self, x=0, y=0):
        self._x = x
        self._y = y

    def get_x(self):
        return self._x

    def set_x(self, x):
        self._x = x

    def get_y(self):
        return self._y

    def set_y(self, y):
        self._y = y

    def __str__(self):
        return f"Ponto x={self.get_x()} y={self.get_y()}"


if __name__ == "__main__":
    # Equivalente a Ponto()
    p = Ponto()

    print(f"Ponto x={p.get_x()} y={p.get_y()}")
    print(p)

    # Equivalente a Ponto(int x)
    p2 = Ponto(10)
    print(p2)

    # Equivalente a Ponto(int x, int y)
    p3 = Ponto(10, 20)
    print(p3)