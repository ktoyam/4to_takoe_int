package pract7;

public class Glass extends Dish {

    @Override
    public void WashUp() {
        if(!IsClean) {
            IsClean = true;
        }
    }

    public void Broke(){
        IsBroken = true;
    }
}
