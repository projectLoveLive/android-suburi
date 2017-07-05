package pink.nico.project.lovelive.suburi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Random;

public class IntroduceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // レイアウトファイルactivity_introduce.xmlを関連付け
        setContentView(R.layout.activity_introduce);

        // リストに表示するデータを準備
        String characters[] = {
                "高坂　穂乃果",
                "南　ことり",
                "園田　海未",
                "小泉　花陽",
                "星空　凛",
                "西木野　真姫",
                "矢澤　にこ",
                "絢瀬　絵里",
                "東條　希"};
        String desc[] = {
                "μ'sのリーダー。いつも笑顔でとにかく元気が取り柄",
                "μ'sの衣装担当。おっとりと柔らかい性格",
                "μ'sの作詞担当。自分に厳しく周りにも厳しい大和撫子",
                "白いご飯が大好物なおとなしい少女",
                "体育会系でいつも明るく元気な少女",
                "μ'sの作曲担当。プライドが高いがさみしがりや",
                "「にっこにっこにー」が合言葉のアイドル研究会部長",
                "学院の生徒会長でロシア人のクォーター",
                "学院の副会長でスピリチュアルな少女"
        };

        // 配列の内容をListItemオブジェクトに詰め替え
        ArrayList<ListItem> data = new ArrayList<>();
        for (int i = 0; i < characters.length; i++){
            ListItem item = new ListItem();
            item.setId((new Random()).nextLong());
            item.setCharacterName(characters[i]);
            item.setDesc(desc[i]);
            data.add(item);
        }

        // ListItem配列とレイアウトとを関連付け
        IntroduceAdapter adapter = new IntroduceAdapter(this, data, R.layout.list_item);
        ListView list = (ListView) findViewById(R.id.introduceList);
        list.setAdapter(adapter);
    }
}
