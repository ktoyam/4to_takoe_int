package pract21.ComplexNums;

public interface IComplexNumberFactory {
    ComplexNumber getNum(double rez, double imz);
    ComplexNumber multiply(ComplexNumber cn1, ComplexNumber cn2);
}
