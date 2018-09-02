package App;

import Map.Map;
import Map.State;
import edu.uci.ics.jung.algorithms.layout.AggregateLayout;
import edu.uci.ics.jung.algorithms.layout.BalloonLayout;
import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.algorithms.layout.DAGLayout;
import edu.uci.ics.jung.algorithms.layout.FRLayout;
import edu.uci.ics.jung.algorithms.layout.FRLayout2;
import edu.uci.ics.jung.algorithms.layout.ISOMLayout;
import edu.uci.ics.jung.algorithms.layout.KKLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.algorithms.layout.RadialTreeLayout;
import edu.uci.ics.jung.algorithms.layout.SpringLayout;
import edu.uci.ics.jung.algorithms.layout.SpringLayout2;
import edu.uci.ics.jung.algorithms.layout.TreeLayout;
import edu.uci.ics.jung.graph.DelegateForest;
import edu.uci.ics.jung.graph.DirectedOrderedSparseMultigraph;
import edu.uci.ics.jung.graph.DirectedSparseMultigraph;
import edu.uci.ics.jung.graph.Forest;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseMultigraph;
import edu.uci.ics.jung.visualization.GraphZoomScrollPane;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import edu.uci.ics.jung.visualization.control.AbstractModalGraphMouse;
import edu.uci.ics.jung.visualization.control.DefaultModalGraphMouse;
import edu.uci.ics.jung.visualization.decorators.EdgeShape;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import edu.uci.ics.jung.visualization.layout.ObservableCachingLayout;
import edu.uci.ics.jung.visualization.renderers.BasicVertexLabelRenderer;
import edu.uci.ics.jung.visualization.renderers.Renderer;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Paint;
import javax.swing.JFrame;
import org.apache.commons.collections15.Factory;
import org.apache.commons.collections15.Transformer;

/**
 *
 * @author Adem KOCAMAZ
 */
public class App extends JFrame{
//-------------------------------------------------------------
    Graph graph;
    Layout layout;
    VisualizationViewer vv;
    Map map;
    State[] states;
    
    Factory<Integer> edgeFactory = new Factory<Integer>() {
		int i=0;
		public Integer create() {
			return i++;
		}};
//-------------------------------------------------------------    
    public App() throws HeadlessException {
        setLayout(new BorderLayout());     
        
        graph = new DirectedOrderedSparseMultigraph();
        map=new Map();
        states=map.getStates();
        buildGraph();
        
        layout = new ISOMLayout(graph);
        layout.setSize(new Dimension(1280, 1024));
        
        vv=new VisualizationViewer(layout);
        
//        vv.getRenderer().setVertexRenderer(
//                new GradientVertexRenderer(
//                        Color.white, Color.red,
//                        Color.white, Color.blue,
//                        vv.getPickedVertexState(),
//                        false));
        
        
        Transformer<State,Paint> vertexPaint;
        vertexPaint = new Transformer<State,Paint>() {
            @Override
            public Paint transform(State i) {
                return  i.getColor();
            }
        };
        
        vv.getRenderContext().setVertexFillPaintTransformer(vertexPaint);
        
        vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
        vv.getRenderer().getVertexLabelRenderer().setPositioner(new BasicVertexLabelRenderer.InsidePositioner());
        vv.getRenderer().getVertexLabelRenderer().setPosition(Renderer.VertexLabel.Position.AUTO);
        vv.getRenderContext().setEdgeShapeTransformer(new EdgeShape.Line());
        
        
        final GraphZoomScrollPane panel = new GraphZoomScrollPane(vv);        
        
        final AbstractModalGraphMouse graphMouse = new DefaultModalGraphMouse();
        vv.setGraphMouse(graphMouse);
        
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
//-------------------------------------------------------------
    private void buildGraph(){
        //Add vertices
        for (int i = 0; i < states.length; i++) {
            graph.addVertex(states[i]);
        }
        
        //Add edges
        for (int i = 0; i < states.length; i++) {
            State[] adjacents=states[i].getAdjacencyList();
            for (int j = 0; j < adjacents.length; j++) {
                graph.addEdge(edgeFactory.create(),states[i],adjacents[j]);
            }
        }
    }
//-------------------------------------------------------------    
    public static void main(String[] args) {        
        new App();
    }
//-------------------------------------------------------------    
}
