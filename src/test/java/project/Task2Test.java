package project;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Task2Test {

    @Test
    public void shouldBeReturningDescendingOrder() {
        // given
        List<String> list = new ArrayList<>(Arrays.asList("aw", "BaAb", "ba", "cddd"));

        // when
        List<String> answer = Task2.sortDescending(list);

        // then
        assertThat(answer).containsExactly("cddd", "BaAb", "ba", "aw");
    }
}
