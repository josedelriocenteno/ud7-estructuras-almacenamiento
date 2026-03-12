/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package navegador;

import java.util.LinkedList;
import javax.swing.AbstractListModel;

/**
 *
 * @author delcenjo
 */
public class MiModeloLista extends AbstractListModel<PaginaWeb> {

    private LinkedList<PaginaWeb> lista;

    public MiModeloLista(LinkedList<PaginaWeb> lista) {
        this.lista = lista;
    }

    public void addFirst(PaginaWeb pagina) {
        lista.addFirst(pagina);
        fireIntervalAdded(this, 0, 0);
    }

    public void clear() {
        int size = lista.size();
        lista.clear();
        if (size > 0) {
            fireIntervalRemoved(this, 0, size - 1);
        }
    }

    @Override
    public int getSize() {
        return lista.size();
    }

    @Override
    public PaginaWeb getElementAt(int index) {
        return lista.get(index);
    }
}