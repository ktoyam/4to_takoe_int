package pract21.Chairs;

public class Client {
    private IChair currentChair;
    public void Sit(IChair chair){
        currentChair = chair;
    }
}
