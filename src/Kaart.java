import java.util.*;
public class Kaart {
    private String type;
    private int nummer ;

    private void setType(String type) {
        if (type.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (type != "harten" || type != "schoppen" || type != "klaveren" || type != "ruiten") {
            throw new IllegalArgumentException();
        }
        this.type = type;
    }

    private void setNummer(int nummer) {
        if (nummer < 0) {
            throw new IllegalArgumentException();
        }
        if (nummer < 1 || nummer > 13) {
            throw new IllegalArgumentException();
        }
        this.nummer =nummer;
    }

    public Kaart(int nummer, String type) {
        setType(type);
        setNummer(nummer);
    }
    private int nummerGenereren()
    {
        Random r = new Random();
        int low = 0;
        int high = 5;
        int result = r.nextInt(high-low) + low;
        return result;
    }
    public Kaart(){
        int nummer = nummerGenereren();
        int type = nummerGenereren();
        String typex = "";
        switch(type)
        {
            case 1-> typex = "schoppen";
            case 2 ->typex = "harten";
            case 3->typex = "ruiten";
            case 4-> typex = "klaveren";
        }
        this.type = typex;
        this.nummer = nummer;

    }

    public String getType() {
        return type;
    }

    public int getNummer() {
        return nummer;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Kaart)
        {
            if(((Kaart) obj).getNummer() == this.nummer &&this.type == ((Kaart) obj).getType())
                return true;
            else
                return false;
        }
        else
            throw new IllegalArgumentException();
    }

    @Override
    public String toString() {
        return "Kaart{" +
                "type='" + type + '\'' +
                ", nummer=" + nummer +
                '}';
    }

}
