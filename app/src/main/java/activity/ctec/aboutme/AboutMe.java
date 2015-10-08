package activity.ctec.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;
import android.widget.ImageView;



public class AboutMe extends AppCompatActivity {
//declaration

    private Button Games;
    private Button Music;
    private Button nextPage1;
    private TextView gamesText;
    private TextView musicText;
    private ImageView gamesPic;
    private ImageView musicPic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
        // initialization- (name) =(type) findViewById(R.id."idName");

        Games = (Button) findViewById(R.id.Games);
        gamesText = (TextView) findViewById(R.id.GamesText);
        gamesPic =(ImageView) findViewById(R.id.gamesPic);

        Music = (Button) findViewById(R.id.Music);
        musicText = (TextView) findViewById(R.id.MusicText);
        musicPic =(ImageView) findViewById(R.id.musicPic);


        nextPage1 = (Button) findViewById(R.id.NextPage1);


        setUpListeners();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_about_me, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void changeVisibility() {
        //Gametext visible settings

        if (gamesText.getVisibility() == View.VISIBLE) {
            gamesText.setVisibility(View.GONE);


        } else {
            gamesText.setVisibility(View.VISIBLE);
        }
        //gamePic visible settings
        if (gamesPic.getVisibility() == View.VISIBLE) {
            gamesPic.setVisibility(View.GONE);


        } else {
            gamesPic.setVisibility(View.VISIBLE);
        }

    }

    private void changeVisibilityMusic() {
        //MusicText visible settings
        if (musicText.getVisibility() == View.VISIBLE) {
            musicText.setVisibility(View.GONE);

        } else {
            musicText.setVisibility(View.VISIBLE);
        }
            //musicPic visible settings
        if (musicPic.getVisibility() == View.VISIBLE) {
            musicPic.setVisibility(View.GONE);

        } else {
            musicPic.setVisibility(View.VISIBLE);
        }

    }


    private void setUpListeners() {

        Games.setOnClickListener(new View.OnClickListener() {
            public void onClick(View GamesText) {
                changeVisibility();
            }
        });
        Music.setOnClickListener(new View.OnClickListener() {
            public void onClick(View MusicText) {
                changeVisibilityMusic();
            }
        });


        nextPage1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View buttonView)
            {
                Intent returnIntent = new Intent();
                setResult(RESULT_OK, returnIntent);
                finish();
            }
        });


    }
}







