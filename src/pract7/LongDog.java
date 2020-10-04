package pract7;

public class LongDog extends Dog{
    public double Length;

    @Override
    public void Call() {
        if(!IsNear)
            IsNear = true;
    }

    @Override
    public void Wash() {
        if(!IsDirty)
            IsDirty = true;
    }
}
