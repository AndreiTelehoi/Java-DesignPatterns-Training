package memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerSalvari {

    private List<MementoCaracterJoc> salvari = new ArrayList<>();

    public void adaugaMemento(MementoCaracterJoc memento){
        salvari.add(memento);
    }

    public MementoCaracterJoc getMemento(int index){
        return salvari.get(index);
    }
    public MementoCaracterJoc getLastMemento() throws Exception{
        if(salvari.size()!=0){
            MementoCaracterJoc memento = salvari.get(salvari.size()-1);
            salvari.remove(salvari.size()-1);
            return memento;
        } else {
            throw new Exception("Nu exista stari salvate");
        }
    }

}
