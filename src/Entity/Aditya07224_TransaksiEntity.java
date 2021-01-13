package Entity;

public class Aditya07224_TransaksiEntity {
    private String idtrx;
    private Aditya07224_pelangganEntity pelanggan;
    private Aditya07224_SepedaMotorEntity sepedaMotor;
    private boolean verified;
    

    public Aditya07224_TransaksiEntity(String idtrx,Aditya07224_SepedaMotorEntity sepedaMotor,
                                       Aditya07224_pelangganEntity pelanggan, boolean verified) {
        this.idtrx = idtrx;
        this.pelanggan = pelanggan;
        this.sepedaMotor = sepedaMotor;
        this.verified = verified;
    }

    public String getIdtrx() {
        return idtrx;
    }

    public Aditya07224_pelangganEntity getPelanggan() {
        return pelanggan;
    }

    public Aditya07224_SepedaMotorEntity getSepedaMotor() { return sepedaMotor; }

    public boolean isVerified() { return verified; }
}