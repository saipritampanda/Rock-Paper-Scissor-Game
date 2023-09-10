package com.nightxstudio.rockpaperscissorgame;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialog;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random rn = new Random();

    //OBJECTS INITIALIZATIONS:--
    TextView userScore;
    TextView computerScore;

    TextView yourChoice;
    ImageView yourChoiceImage;
    TextView computerChoice;
    ImageView computerChoiceImage;

    TextView result;

    ImageView rock;
    ImageView paper;
    ImageView scissor;

    TextView downText;
    TextView countScore;

    int user = 0;
    int computer = 0;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_menu , menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        final MediaPlayer reset = MediaPlayer.create(this , R.raw.reset);

        switch(item.getItemId())
        {
            case R.id.refresh:
                computerChoiceImage.setImageResource(0);
                yourChoiceImage.setImageResource(0);
                user = 0;
                userScore.setText("USER: 0");
                computer = 0;
                computerScore.setText("COMPUTER: 0");
                countScore.setTag(0);
                result.setText("~ Select Your Choice ~");
                reset.start();
                Toast.makeText(this ,"Reset Of Both Player's Score Is Successfully Done" , Toast.LENGTH_LONG).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        userScore  = findViewById(R.id.userScore);
        computerScore = findViewById(R.id.computerScore);
        yourChoice = findViewById(R.id.yourChoice);
        yourChoiceImage = findViewById(R.id.yourChoiceImage);
        computerChoice = findViewById(R.id.computerChoice);
        computerChoiceImage = findViewById(R.id.computerChoiceImage);
        result = findViewById(R.id.result);
        rock = findViewById(R.id.rock);
        paper = findViewById(R.id.paper);
        scissor = findViewById(R.id.scissor);
        downText = findViewById(R.id.downText);
        countScore = findViewById(R.id.countScore);

        final MediaPlayer mp = MediaPlayer.create(this , R.raw.sample);
        final MediaPlayer reset = MediaPlayer.create(this , R.raw.reset);

        computerChoiceImage.setImageResource(0);
        yourChoiceImage.setImageResource(0);
        user = 0;
        computer = 0;



            rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.start();
                int cpu = rn.nextInt(3) + 1;
                switch (cpu)
                {
                    case 1:
                        result.setText("It's a Draw!  Score +0");
                        computerChoiceImage.setImageResource(R.drawable.rock);
                        yourChoiceImage.setImageResource(R.drawable.rock);
                        user += 0;
                        computer += 0;
                        //i += 1;
                        userScore.setText("USER: " + user);
                        computerScore.setText("COMPUTER: " + computer);
                        //countScore.setTag(i);
                        break;
                    case 2:
                        result.setText("You Lose!  Score +0");
                        computerChoiceImage.setImageResource(R.drawable.paper);
                        yourChoiceImage.setImageResource(R.drawable.rock);
                        user += 0;
                        computer += 1;
                        //i += 1;
                        userScore.setText("USER: " + user);
                        computerScore.setText("COMPUTER: " + computer);
                        //countScore.setTag(i);
                        break;
                    case 3:
                        result.setText("You Win!  Score +1");
                        computerChoiceImage.setImageResource(R.drawable.scissor);
                        yourChoiceImage.setImageResource(R.drawable.rock);
                        user += 1;
                        computer += 0;
                        //i += 1;
                        userScore.setText("USER: " + user);
                        computerScore.setText("COMPUTER: " + computer);
                        //countScore.setTag(i);
                        break;
                }
            }
        });

        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.start();
                int cpu = rn.nextInt(3) + 1;
                switch (cpu)
                {
                    case 1:
                        result.setText("You Win!  Score +1");
                        computerChoiceImage.setImageResource(R.drawable.rock);
                        yourChoiceImage.setImageResource(R.drawable.paper);
                        user += 1;
                        computer += 0;
                        //i += 1;
                        userScore.setText("USER: " + user);
                        computerScore.setText("COMPUTER: " + computer);
                        //countScore.setTag(i);
                        break;
                    case 2:
                        result.setText("It's a Draw!  Score +0");
                        computerChoiceImage.setImageResource(R.drawable.paper);
                        yourChoiceImage.setImageResource(R.drawable.paper);
                        user += 0;
                        computer += 0;
                        //i += 1;
                        userScore.setText("USER: " + user);
                        computerScore.setText("COMPUTER: " + computer);
                        //countScore.setTag(i);
                        break;
                    case 3:
                        result.setText("You Lose!  Score +0");
                        computerChoiceImage.setImageResource(R.drawable.scissor);
                        yourChoiceImage.setImageResource(R.drawable.paper);
                        user += 0;
                        computer += 1;
                        //i += 1;
                        userScore.setText("USER: " + user);
                        computerScore.setText("COMPUTER: " + computer);
                        //countScore.setTag(i);
                        break;
                }
            }
        });

        scissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.start();
                int cpu = rn.nextInt(3) + 1;
                switch (cpu)
                {
                    case 1:
                        result.setText("You Lose!  Score +0");
                        computerChoiceImage.setImageResource(R.drawable.rock);
                        yourChoiceImage.setImageResource(R.drawable.scissor);
                        user += 0;
                        computer += 1;
                        //i += 1;
                        userScore.setText("USER: " + user);
                        computerScore.setText("COMPUTER: " + computer);
                        //countScore.setTag(i);
                        break;
                    case 2:
                        result.setText("You Win!  Score +1");
                        computerChoiceImage.setImageResource(R.drawable.paper);
                        yourChoiceImage.setImageResource(R.drawable.scissor);
                        user += 1;
                        computer += 0;
                        //i += 1;
                        userScore.setText("USER: " + user);
                        computerScore.setText("COMPUTER: " + computer);
                        //countScore.setTag(i);
                        break;
                    case 3:
                        result.setText("It's a Draw!  Score +0");
                        computerChoiceImage.setImageResource(R.drawable.scissor);
                        yourChoiceImage.setImageResource(R.drawable.scissor);
                        user += 0;
                        computer += 0;
                        //i += 1;
                        userScore.setText("USER: " + user);
                        computerScore.setText("COMPUTER: " + computer);
                        //countScore.setTag(i);
                        break;
                }
            }

        });


        AlertDialog.Builder res = new AlertDialog.Builder(this);
        res.setTitle("Result");
        if (user > computer){
            res.setMessage("User Won: " + user);
        }
        else{
            res.setMessage("Computer Won: " + computer);
        }
        res.setPositiveButton("Retry", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                computerChoiceImage.setImageResource(0);
                yourChoiceImage.setImageResource(0);
                user = 0;
                userScore.setText("USER: 0");
                computer = 0;
                computerScore.setText("COMPUTER: 0");
                countScore.setTag(0);
                result.setText("~ Select Your Choice ~");
            }
        });
        res.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        final AlertDialog resultDialougeBox = res.create();

        String userFinalStringScore = String.valueOf(userScore.getText());
        userFinalStringScore = userFinalStringScore.toLowerCase(Locale.ROOT);
        userFinalStringScore = userFinalStringScore.replace("u" , "");
        userFinalStringScore = userFinalStringScore.replace("s" , "");
        userFinalStringScore = userFinalStringScore.replace("e" , "");
        userFinalStringScore = userFinalStringScore.replace("r" , "");
        userFinalStringScore = userFinalStringScore.replace(":" , "");
        userFinalStringScore = userFinalStringScore.replace(" " , "");

        String computerFinalString = String.valueOf(computerScore.getText());
        computerFinalString =computerFinalString.toLowerCase(Locale.ROOT);
        computerFinalString = computerFinalString.replace("c" , "");
        computerFinalString = computerFinalString.replace("o" , "");
        computerFinalString = computerFinalString.replace("m" , "");
        computerFinalString = computerFinalString.replace("p" , "");
        computerFinalString = computerFinalString.replace("u" , "");
        computerFinalString = computerFinalString.replace("t" , "");
        computerFinalString = computerFinalString.replace("e" , "");
        computerFinalString = computerFinalString.replace("r" , "");
        computerFinalString = computerFinalString.replace(":" , "");
        computerFinalString = computerFinalString.replace(" " , "");

        int userFinalScore = Integer.parseInt(userFinalStringScore);
        int computerFinalScore = Integer.parseInt(computerFinalString);


        if (userFinalScore == 10 || computerFinalScore == 10){
            if (userFinalScore > computerFinalScore){
                Toast.makeText(this , "User won!" , Toast.LENGTH_SHORT).show();
                resultDialougeBox.show();

            }
            else{
                Toast.makeText(this , "Computer won!" , Toast.LENGTH_SHORT).show();
                resultDialougeBox.show();
            }
        }


        //Change Status Bar color:
        Window window = this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(this.getResources().getColor(R.color.colorPrimary));

        //Change Action Bar color:
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable actionBackground = new ColorDrawable(Color.parseColor("#cf8150"));
        assert actionBar != null;
        actionBar.setBackgroundDrawable(actionBackground);
    }


}