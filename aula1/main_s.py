from memoria_s import MemoriaS
from hd import HD
from cd import CD


def main():
    # Polimorfismo: as variáveis são indicadas como MemoriaS,
    # mas recebem objetos das classes HD e CD.
    hd: MemoriaS = HD("46327", 10, MemoriaS.MB)
    cd: MemoriaS = CD(650, MemoriaS.MB)

    print(hd)
    print(cd)

    hd.grava_kb(1024)
    print(hd)

    cd.grava_kb(600)
    print(cd)

    # Python não precisa de downcasting.
    print(f"Número de série: {hd.get_numero_serie()}")
    print(f"Estado do CD: {cd.get_estado()}")


if __name__ == "__main__":
    main()