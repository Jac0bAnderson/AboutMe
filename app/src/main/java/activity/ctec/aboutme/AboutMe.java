package activity.ctec.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;


public class AboutMe extends AppCompatActivity
{
//declaration

    private Button Games;
    private Button Music;
    private Button nextPage1;
    private TextView gamesText;
    private TextView musicText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
        // initialization- (name) =(type) findViewById(R.id."idName");

        Games = (Button)findViewById(R.id.Games);
        gamesText =(TextView)findViewById(R.id.GamesText);

        Music = (Button)findViewById(R.id.Music);
        musicText =(TextView)findViewById(R.id.MusicText);



        nextPage1 = (Button)findViewById(R.id.NextPage1);


        setUpListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_about_me, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void changeVisibility()
    {
        //Gametext visible settings

        if (gamesText.getVisibility() == View.VISIBLE)
        {
             gamesText.setVisibility(View.GONE);
        }
        else
        {
            gamesText.setVisibility(View.VISIBLE);
        }

    }

    private void changeVisibilityMusic()
    {
        //MusicText visible settings
        if (musicText.getVisibility() == View.VISIBLE)
        {
            musicText.setVisibility(View.GONE);
        } else {
            musicText.setVisibility(View.VISIBLE);
        }
    }


        //listeners


    nextPage1.setOnClickListener(new View.OnClickListener()
    {
        public void onClick(View buttonView) {
            Intent returnIntent = new Intent();
            setResult(RESULT_OK, returnIntent);
            finish();
        }
    });
    

}






}
