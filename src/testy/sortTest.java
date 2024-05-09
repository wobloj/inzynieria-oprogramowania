package testy;

import static org.junit.Assert.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class sortTest extends sort {

	sort sorter;

	@BeforeEach
	void setUp() throws Exception {
		sorter = new sort();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		int[] emptyArray = {};
        int[] sortedEmptyArray = sorter.sortuj(emptyArray);
        assertArrayEquals(new int[]{}, sortedEmptyArray);

        // Test dla tablicy z jednym elementem
        int[] singleElementArray = {5};
        int[] sortedSingleElementArray = sorter.sortuj(singleElementArray);
        assertArrayEquals(new int[]{5}, sortedSingleElementArray);

        // Test dla tablicy posortowanej malejąco
        int[] descendingArray = {5, 4, 3, 2, 1};
        int[] sortedDescendingArray = sorter.sortuj(descendingArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sortedDescendingArray);

        // Test dla tablicy posortowanej rosnąco
        int[] ascendingArray = {1, 2, 3, 4, 5};
        int[] sortedAscendingArray = sorter.sortuj(ascendingArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sortedAscendingArray);

        // Test dla tablicy zawierającej losowe wartości
        int[] randomArray = {3, 7, 1, 4, 2, 8, 6, 5};
        int[] sortedRandomArray = sorter.sortuj(randomArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, sortedRandomArray);
	}

}
