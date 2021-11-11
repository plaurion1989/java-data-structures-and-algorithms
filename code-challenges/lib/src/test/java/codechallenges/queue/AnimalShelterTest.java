package codechallenges.queue;
import org.junit.jupiter.api.Test;

public class AnimalShelterTest
{
    @Test void animalShelterTest1()
        {
            AnimalShelter animalShelterTest = new AnimalShelter();
            animalShelterTest.enqueue("cat");
            animalShelterTest.enqueue("dog");
            animalShelterTest.enqueue("DoG");
            animalShelterTest.enqueue("cAt");
            animalShelterTest.enqueue("moose");

            animalShelterTest.dequeue("cat");
            animalShelterTest.dequeue("dog");
            animalShelterTest.dequeue("cat");
            animalShelterTest.dequeue("cat");//shouldn't work... i'm all out of cats
            animalShelterTest.dequeue("dog");//queue is empty because it removed DoG when getting cAt.
        }
}
