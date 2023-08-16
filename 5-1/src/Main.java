import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

        public class Main {

            public static void main(String[] args) {

//              問① 下記例の配列をString型しか格納できないように修正してください。
//              現状は全てのクラスの継承元であるObject型を指定しているので、Integerもintも格納可能になっています。
//                 例List<Object> array = new ArrayList<>();
//              また、arrayには[hoge, pos, foo]の文字列３要素を入れてください。
//              <以下記述>
                List<String> array = new ArrayList<>();
                array.add("hoge");
                array.add("pos");
                array.add("foo");
                
                    //確認用に出力しています。
                    System.out.println("(確認用)" + array);

//              問② arrayの二つ目の要素を"bar"にしましょう。
//            　<以下記述>
                array.remove(1);
                array.add(1, "bar");
                
                    //確認用に出力しています。
                    System.out.println("(確認用)" + array);
                    System.out.println();
                
//              問③ fooが格納されているインデックスを出力してください。
//            　<以下記述>
                System.out.println("fooのindex：" + array.indexOf("foo"));
                System.out.println();
                
//              問④ キーがString型、バリューがObject型の要素を三つ格納しましょう。
                Map<String, Object> map = new HashMap<>();
//            　<以下記述>
                map.put("MY_NAME", "上原孝太");
                map.put("birthday", 1016);
                map.put("飲酒可能年齢か？", true);
                
//              問⑤上記で格納したキーを繰り返し文で出力しましょう。
//              <以下記述>
                for (Map.Entry<String, Object> mapDisplayer : map.entrySet()) {
                System.out.println("key : " + mapDisplayer.getKey());
                }
                System.out.println();
                
//              問⑥上記で格納したバリューを繰り返し文で出力しましょう。
//              <以下記述>
                for (Map.Entry<String, Object> mapDisplayer : map.entrySet()) {
                System.out.println("value : " + mapDisplayer.getValue());
                }
                System.out.println();
                
//              問⑦ Calender型calを使い、int型配列arrayDateに今の年・月・日を入れてください。
                Calendar cal = Calendar.getInstance();
//              <以下記述>
                int[] arrayDate = new int[3];
                arrayDate[0] = cal.get(Calendar.YEAR);
                arrayDate[1] = cal.get(Calendar.MONTH) +1;
                arrayDate[2] = cal.get(Calendar.DATE);
                
                    //確認用に出力しています。
                    for(int i=0; i<3; i++) {
                        System.out.println("(確認用)" + arrayDate[i]);
                    }
                    System.out.println();
                
//              問⑧ 配列arrayDateをList型に置換しましょう。
//              ヒント：asListメソッドはプリミティブ型のデータ型のみ扱えます。
//              <以下記述>
                //arrayDateは配列型のため、プリミティブ型のみを扱えるasListは使えない。
                //そこで、for文によってarrayDateに入っているi番目の要素を、新に作ったArrayListのarrayListDateのi番目に格納することにした。
                List<Integer> arrayListDate = new ArrayList<>();
                
                for (int i = 0; i < arrayDate.length; i++) {
                    arrayListDate.add(i, arrayDate[i]);
                }
                
//              問⑨ 上記で格納した要素を繰り返しで出力しましょう。
//              <以下記述>
                for (Integer arrayListDate2 : arrayListDate) {
                System.out.println(arrayListDate2);
                }
                
            }
        }