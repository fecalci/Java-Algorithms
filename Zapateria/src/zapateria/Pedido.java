package zapateria;

public class Pedido {
    
    int fechaPedido, idPedido, dniCliente;

    public Pedido(int fechaPedido, int idPedido, int dniCliente) {
        this.fechaPedido = fechaPedido;
        this.idPedido = idPedido;
        this.dniCliente = dniCliente;
    }
    
    //-----------------------------------------------------

    public int getFechaPedido() {
        return fechaPedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    
    //-----------------------------------------------------
    
    
    
    public void setFechaPedido(int fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }
    
    
    //-----------------------------------------------------
    
    
    void avisarPedido (){       
        System.out.println("El pedido número "+idPedido+ " está en camino");
    }
    
    
    
}
