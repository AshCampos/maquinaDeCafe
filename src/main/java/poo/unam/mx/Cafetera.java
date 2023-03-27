package poo.unam.mx;

public class Cafetera {

    private int agua;
    private int cafe;
    private int crema;
    private int vasos;

    public Cafetera() {
    }

    public Cafetera(int agua, int cafe, int crema, int vasos) {
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
        this.vasos = vasos;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        if (agua <= 5000) {
            this.agua = agua;
        } else {
            System.out.println("Lo siento, no hay suficiente agua para hacer mas cafe");
        }
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        if (cafe <= 1000) {
            this.cafe = cafe;
        } else {
            System.out.println("no hay mas cafe");
        }
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        if (crema <= 1500) {
            this.crema = crema;
        } else {
            System.out.println("lo siento, no hay mas crema");
        }
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        if (vasos <= 50) {
            this.vasos = vasos;
        } else {
            System.out.println("Lo siento, no se pueden hacer mas cafes, no hay mas vasos ");
        }
    }

    @Override
    public String toString() {
        return "Cafetera{" + "agua=" + agua + ", cafe=" + cafe + ", crema=" + crema + ", vasos=" + vasos + '}';
    }
// condicionante para cada tipo de café
    public boolean americano() {
        if (agua >= 180 && cafe >= 15 && vasos > 0) {
            agua -= 180;
            cafe -= 15;
            vasos--;
            System.out.println("Cafe americano");
            return true;
        } else {
            System.out.println("No se puede hacer otro café americano, recursos insuficientes");
            return false;
        }

    }

    public boolean expreso() {
        if (agua >= 120 && cafe >= 20 && vasos > 0) {
            agua -= 120;
            cafe -= 20;
            vasos--;
            System.out.println("cafe expreso");
            return true;
        } else {
            System.out.println("Lo siento, no se puede hacer otro café expreso, recursos insuficientes");
            return false;
        }
    }

    public boolean capuchino() {
        if (agua >= 100 && cafe >= 14 && crema >= 70 && vasos > 0) {
            agua -= 100;
            cafe -= 14;
            crema -= 70;
            vasos--;
            System.out.println("Cafe capuchino");
              
            return true;
        } else {
            System.out.println("Lo siento, no se puede hacer otro capuchino, recursos insuficientes");
            return false;
        }
    }

    public void restantes() {
        System.out.println("Agua = " + agua);
        System.out.println("Cafe = " + cafe);
        System.out.println("Crema = " + crema);
        System.out.println("Vasos = " + vasos);
    }
}
