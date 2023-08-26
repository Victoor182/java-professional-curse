package HomeWork.HomeWork1;

public class RenteVersicherung {
    private String HansaMerkur;
    private final boolean itsgoverny = false;
    private int dateCreate ;
    private int numberClients ;

    public String getHansaMerkur() {
        return HansaMerkur;
    }

    public void setHansaMerkur(String hansaMerkur) {
        HansaMerkur = hansaMerkur;
    }

    public boolean isItsgoverny() {
        return itsgoverny;
    }

    public int getDateCreate() {
        return dateCreate;
    }


    public int getNumberClients() {
        return numberClients;
    }

    public void setNumberClients(int numberClients) {
        this.numberClients = numberClients;
    }
    public void info() {
        if (!itsgoverny) {
            System.out.println("This Fond use: " + numberClients/1000+"Clients");

        }else
            System.out.println("This fond are use: " +numberClients);
    }
}
