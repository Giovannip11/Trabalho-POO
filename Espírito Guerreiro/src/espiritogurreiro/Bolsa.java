package espiritogurreiro;

import java.util.ArrayList;
import java.util.List;

public class Bolsa {

    public List<Item> itens = new ArrayList<>();

    public void equipar(int idItem) {
        for (Item item : itens) {
            if (item.iditem == idItem) {
                if (!item.equipado) {
                    item.equipado = true;
                    InOut.MsgDeAviso("Item ID:"+idItem, "equipado");
                } else {
                    InOut.MsgDeAviso("Item ID:"+idItem, "Já está equipado");
                }
                return; 
            }
        }
        InOut.MsgDeAviso("Item ID " + idItem, " não encontrado na bolsa.");
            
    }

    public void desequipar(int idItem) {
         for (Item item : itens) {
            if (item.iditem == idItem) {
                if (item.equipado) {
                    item.equipado = false;
                    InOut.MsgDeAviso("Item ID: " + idItem , " desequipado.");
                } else {
                   InOut.MsgDeAviso("Item ID: " + idItem , " não está equipado.");
                }
                return;
            }
        }
        InOut.MsgDeAviso("Item ID: " + idItem , " não encontrado na bolsa.");
    }
}
