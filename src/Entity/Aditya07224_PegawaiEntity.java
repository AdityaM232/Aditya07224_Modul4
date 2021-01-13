package Entity;

public class Aditya07224_PegawaiEntity extends Aditya07224_ManusiaAbstractEntity {
    private String nip;
    public Aditya07224_PegawaiEntity() {
    }
    @Override
    public String getId() {
        return nip;
    }

    @Override
    public void setId(String nip) {
        this.nip = nip;
    }
}