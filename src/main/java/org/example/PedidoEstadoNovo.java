package org.example;

public class PedidoEstadoNovo extends PedidoEstado {

    private PedidoEstadoNovo() {}
    private static PedidoEstadoNovo instance = new PedidoEstadoNovo();

    public static PedidoEstadoNovo getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Novo";
    }

    public boolean preparar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoPreparando.getInstance());
        return true;
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }
}

