package com.appxperts.cardslibstudy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardExpand;
import it.gmariotti.cardslib.library.internal.CardHeader;
import it.gmariotti.cardslib.library.internal.CardThumbnail;
import it.gmariotti.cardslib.library.internal.ViewToClickToExpand;
import it.gmariotti.cardslib.library.view.CardView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Create a Card ---- >>
        Card card = new Card(this, R.layout.row_card);

        // Create a CardHeader
        CardHeader header = new CardHeader(this);
        header.setTitle("Hello world");

        card.setTitle("Simple card demo");


        CardThumbnail thumb = new CardThumbnail(this);
        thumb.setDrawableResource(R.mipmap.ic_launcher);


        //--Add Thumbnail image
        card.addCardThumbnail(thumb);

        // Add Header to card
        card.addCardHeader(header);

        // Set card in the cardView
        CardView cardView = (CardView) findViewById(R.id.carddemo);
        cardView.setCard(card);

        ////----------Second Card ---------->>>

        Card card2 = new Card(getApplicationContext());

        CardHeader header2 = new CardHeader(this);
        header2.setTitle("Stock Exchange");
        // header2.setButtonExpandVisible(true);

        card2.addCardHeader(header2);


        //  CardExpand expand = new CardExpand(this, R.layout.expand_layout);
        CardExpand expand = new CardExpand(this);
        expand.setTitle("This is a very large text for testing.This is a very large text for testing.This is a very large text for testing.This is a very large text for testing.This is a very large text for testing.This is a very large text for testing.This is a very large text for testing.This is a very large text for testing.This is a very large text for testing.This is a very large text for testing.This is a very large text for testing.This is a very large text for testing");


        card2.addCardExpand(expand);


        CardView cardView2 = (CardView) findViewById(R.id.carddemo2);

        ViewToClickToExpand viewToClickToExpand =
                ViewToClickToExpand.builder()
                        .setupView(cardView2);
        card2.setViewToClickToExpand(viewToClickToExpand);

        cardView2.setCard(card2);

    }


}
