package kh.au.contactform;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ប្រកាសអថេរ btnSendData ជំនួសអោយ Button btnSend
        Button btnSendData=findViewById(R.id.btnSend);

        btnSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get the values from the edit text fields :
                String name= ((EditText) findViewById(R.id.name)).getText().toString();
                String email=((EditText) findViewById(R.id.email)).getText().toString();
                String phone=((EditText) findViewById(R.id.phone)).getText().toString();
                String message=((EditText) findViewById(R.id.message)).getText().toString();

                // Send Data to Server
                System.out.println("Name :"+ name + ", Email : "+ email +", Phone"+ phone + "Message : "+ message);

                //Show Message
//                Toast.makeText(MainActivity.this,name + " " + email, Toast.LENGTH_SHORT).show();

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Alert");
                builder.setMessage("Hi,"+ name + " "+ message);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this,name + " " + email, Toast.LENGTH_SHORT).show();
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });


    }
}