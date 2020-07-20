package model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.awt.Rectangle;

public abstract class GameObject {
    Sprite sprite;
    Rectangle rectangle;

    public GameObject(Texture texture , float x, float y, float width, float height){
        rectangle = new Rectangle( (int)x, (int)y, (int)width, (int)height);
        sprite = new Sprite(texture);
    }
    public void draw(SpriteBatch spriteBatch){
        sprite.setBounds(sprite.getX() , sprite.getY() , sprite.getWidth() , sprite.getHeight());
        sprite.draw(spriteBatch);
    }
}
