
from Ponto import Ponto


class Ponto3D(Ponto):
    """Ponto 3D que herda de Ponto"""
    def __init__(self, x=0.0, y=0.0, z=0.0):
        super().__init__(x, y)
        self.z = float(z)

    def get_z(self):
        return self.z

    def set_z(self, z):
        self.z = float(z)

    def __str__(self):
        return f"Ponto3d(x={self.get_x()}, y={self.get_y()}, z={self.z})"

if __name__ == "__main__":
        # p contém um objeto da classe Ponto3D
        p = Ponto3D(1, 2, 3)

        print(f"Ponto x={p.get_x()} y={p.get_y()} z={p.get_z()}")
        print(p)

        # Python não exige downcasting
        p3d = p
        print(f"Ponto z={p3d.get_z()}")
