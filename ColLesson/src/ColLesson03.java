import java.util.Scanner;

public class ColLesson03 {
    public static void main(String[] args) {
        // Wordクラスのインスタンス配列
        Word[] words = new Word[5];

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
                words[index] = wd;
                index++;
            }

            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("エラーが発生しました。");
                System.out.println("単語と意味の間を「半角スペース」にして再入力してね！！！！！");
                System.out.println();
            }

            System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します。");
            input = sc.nextLine();

            if(index == 5){
                System.out.println("登録制限を超えました。登録済みのデータは以下になります。");
                System.out.println();
                break;
            }

        }

        for(int i = 0; i < index; i++){
            System.out.println(words[i]);
        }
        System.out.println(index + "件、登録しました。");
    }
}






