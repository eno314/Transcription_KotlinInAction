package eight;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]) {
        List<String> strings = new ArrayList();
        strings.add("42");
        // JavaのコードでKotlin標準ライブラリの関数を使用可能
        CollectionsKt.forEach(strings, s -> {
            System.out.println(s);
            // Unit型の値を明示的に返す必要がある
            return Unit.INSTANCE;
        });
    }

    private static String readFirstLineFromFile(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }
}
