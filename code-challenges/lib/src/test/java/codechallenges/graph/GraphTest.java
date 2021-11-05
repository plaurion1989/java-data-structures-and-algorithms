package codechallenges.graph;
import org.junit.jupiter.api.Test;

public class GraphTest
{
    @Test
    void Test_a_graph()
    {
        Graph<String> sut = new Graph<>();

        Vertex<String> aNode = sut.addVertex("A");

        sut.addEdge();
    }
}
