package Entity;

public class Aditya07224_AdminEntity extends Aditya07224_ManusiaAbstractEntity {
    private String idAdmin;
    public Aditya07224_AdminEntity() {
    }

    @Override
    public String getId() { return idAdmin; }

    @Override
    public void setId(String idAdmin) {
        this.idAdmin = idAdmin;
    }
}