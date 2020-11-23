package pract21.ComplexNums;

public final class ComplexNumber {
    public final double Rez;
    public final double Imz;

    public static ComplexNumber sum(ComplexNumber cn1, ComplexNumber cn2){
        return new ComplexNumber(cn1.Rez+ cn2.Rez, cn1.Imz+cn2.Imz);
    }

    public ComplexNumber(double rez, double imz) {
        Rez = rez;
        Imz = imz;
    }
}
