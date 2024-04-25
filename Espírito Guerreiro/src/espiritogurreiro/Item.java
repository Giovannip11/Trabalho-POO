package espiritogurreiro;

public class Item {

    public int iditem;
    public String tipoitem;
    public boolean equipado;

    public void imprimirDados() {
        InOut.MsgDeAviso("ID do item",""+ iditem);
        InOut.MsgDeAviso("Tipo:",""+ tipoitem); 
        InOut.MsgDeAviso("Equipado",""+ (equipado+ "Sim ou não"));
    }
}
