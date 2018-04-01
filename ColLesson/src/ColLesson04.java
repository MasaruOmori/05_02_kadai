import java.util.ArrayList;
import java.util.Scanner;


public class ColLesson04 {
    public static void main(String[] args) {
        // Wordクラスのインスタンス配列

         ArrayList <Word> words = new ArrayList<>();


        // コマンドラインから入力
        System.out.println("わからない単語とその意味をスペースで区切って入力して下さい。");
        Scanner sc  = new Scanner(System.in);
        String input = sc.nextLine();

        int index = 0;

        while(!input.equals("e")){
            String[] tmp = new String[2];

            try {
                tmp = input.split(" ");
                Word wd = new Word(tmp[0], tmp[1]);
                words.add(wd);
                index++;
            }

            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("エラーが発生しました。");
                System.out.println("単語と意味の間を「半角スペース」にして再入力してね！！！！！");
                System.out.println();
            }

            System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します。");
            input = sc.nextLine();

        }

        for(int i = 0; i < index; i++){
            System.out.println(words.get(i));
        }

        System.out.println(index + "件、登録しました。");
    }
}






