package eight;

import kotlin.jvm.functions.Function1;

public class Main {

    public static void main(String args[]) {
        MainKt.processTheAnswer(
                // Kotlinの関数型をJavaのコードから使う(Java8以前)
                new Function1<Integer, Integer>() {
                    @Override
                    public Integer invoke(Integer number) {
                        System.out.println(number);
                        return number + 1;
                    }
                });
    }
}
