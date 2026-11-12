package eu1_ky.paquete.ser;

public class Pedido {
    private String codigo;
    private String producto;
    private double valorOriginal;
    private TipoCliente tipocliente;

    public Pedido() {
    }

    public Pedido(String codigo, String producto, double valorOriginal, TipoCliente tipocliente) {
        this.codigo = codigo;
        this.producto = producto;
        this.valorOriginal = valorOriginal;
        this.tipocliente = tipocliente;
    }


    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public double getValorOriginal() {
        return valorOriginal;
    }
    public void setValorOriginal(double valorOriginal) {
        this.valorOriginal = valorOriginal;
    }
    public TipoCliente getTipocliente() {
        return tipocliente;
    }
    public void setTipocliente(TipoCliente tipocliente) {
        this.tipocliente = tipocliente;
    }

    

}
