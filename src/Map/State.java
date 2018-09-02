package Map;

import java.awt.Color;
import java.awt.Polygon;
import java.util.ArrayList;

/**
 *
 * @author Adem KOCAMAZ
 */
public class State {
//-------------------------------------------------------------

    private String name;
    private Color color;
    private ArrayList<State> adjacents;
    private int numOfAdj;
//-------------------------------------------------------------

    public State(String name) {
        this.name = name;
        this.color = Color.WHITE;
        this.adjacents = new ArrayList<State>();
        numOfAdj = 0;
    }
//-------------------------------------------------------------

    public Color getColor() {
        return color;
    }
//-------------------------------------------------------------

    public String getName() {
        return name;
    }
//-------------------------------------------------------------

    public void setColor(Color color) {
        this.color = color;
    }
//-------------------------------------------------------------

    public void setName(String name) {
        this.name = name;
    }
//-------------------------------------------------------------

    public void insertAdjacent(State state) {
        adjacents.add(state);
    }
//-------------------------------------------------------------

    public State[] getAdjacencyList() {
        State[] list = new State[adjacents.size()];
        for (int i = 0; i < adjacents.size(); i++) {
            list[i] = adjacents.get(i);
        }
        return list;
    }
//-------------------------------------------------------------    

    @Override
    public String toString() {
        return name;
    }
//-------------------------------------------------------------    
}
