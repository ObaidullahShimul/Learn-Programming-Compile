package www.siit.com.simpleblogapp;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;


import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.UploadTask;
import com.squareup.picasso.Callback;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;

import java.util.Random;

public class PostActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mSelectImage;
    private static final int GALLERY_REQUEST=1;

    private EditText mPostTitle;
    private EditText mPostDece;
    private Button submitBtn;
    private Uri mImageUri;

    Random random;

    StorageReference storageReference;
    //private ProgressDialog mProgress;
    DatabaseReference databaseReference;
    //Datab
    StorageTask uploadTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        //------2------
        //databaseReference=FirebaseDatabase.getInstance().getReference();
        databaseReference=FirebaseDatabase.getInstance().getReference("Up");
        storageReference=FirebaseStorage.getInstance().getReference("Up");


        mPostTitle=findViewById(R.id.titleField);
        mPostDece=findViewById(R.id.descField);
        submitB