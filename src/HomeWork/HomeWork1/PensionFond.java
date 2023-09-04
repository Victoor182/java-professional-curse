package HomeWork.HomeWork1;

import java.util.Objects;

public class PensionFond {
    private String namefond;
    private final boolean itsgoverny = false;
    private int dateCreate;
    private int numberClients;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PensionFond that)) return false;
        return itsgoverny == that.itsgoverny && dateCreate == that.dateCreate && numberClients == that.numberClients && Objects.equals(namefond, that.namefond);
    }

    @Override
    public String toString() {
        return "PensionFond{" +
                "namefond='" + namefond + '\'' +
                ", itsgoverny=" + itsgoverny +
                ", dateCreate=" + dateCreate +
                ", numberClients=" + numberClients +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(namefond, itsgoverny, dateCreate, numberClients);
    }

    public String getNameFond() {
        return namefond;
    }

    public void setNameFond(String NameFond) {
        NameFond = NameFond;
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
            System.out.println("This Fond use: " + numberClients / 1000 + "Clients");

        } else
            System.out.println("This fond are use: " + numberClients);
    }
}
