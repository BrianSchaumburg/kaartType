import java.util.*;
public class Kaartdeck {
    Kaart[] deck;
    public Kaartdeck()
    {
        deck =new Kaart[52];
    }
    public void shuffle()
    {Random r = new Random();
        ArrayList<Integer> getallen = new ArrayList<>();
        do {
           int nummer = r.nextInt(52-0)+0;
            if(getallen.contains(nummer))
            getallen.add(nummer);
        }
        while(getallen.size()!=52);
        for (int i = 0; i < deck.length; i++) {
            deck[i] = deck[getallen.get(i)];
        }

    }
    public void terugSteken(Kaart kaart)
    {   if(kaart == null)
        throw new IllegalArgumentException();
        boolean toelating = false;
        int nummer = 0;
        do {
            if(deck[nummer] == null){
                deck[nummer] =kaart; toelating = true;}
            else
                nummer ++ ;

        }
        while(nummer!=51 || toelating == true);
    }
    public Kaart trek()
    {   Random rnd = new Random(); int high = 0;
        int index = 0;
        while(index!=51)
        {if(deck[index] == null)
        {high = index; break;}
            else
                index++;

        }
        int getal = rnd.nextInt(high-0)+0;
        Kaart kaart  = deck[getal];
        deck[getal] =null;
return kaart;

    }
    public void maakDeck()
    {
        deck =new Kaart[52];
        ;
        for(int i = 0; i < deck.length; i ++ )
            deck[i]= new Kaart();
    }
    public Kaart verwijderKaart(int index)
    {

        Kaart kaart = deck[index];
        if(kaart == null)
            throw new IllegalArgumentException();
        deck[index] =null;
        return kaart;

    }
}
