package Projeto.finals;

public class CasualGamer extends Gamer{
    @Override
    public String keyboard()
    {return "Simple keyboard...";}

    //não consigo chamar mouse pois é final public String mouse(); {return super.mouse()}

    public String play(final String game){
        return "jogando :" + game;

    }
}
