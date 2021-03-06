package com.ltse.gui.components;

import com.ltse.gui.exceptions.UIException;
import com.ltse.gui.exceptions.ValueException;
import com.ltse.gui.utils.UIUtils;

import javax.swing.*;

public class Component {
  String idComponent; // package-private
  String typeComponent; // It cannot change
  int positionX;
  int positionY;
  int height;
  int width;
  JFrame frame;
  Component(
    String idComponent,
    String typeComponent,
    int positionX,
    int positionY,
    int height,
    int width,
    JFrame frame
  ) throws UIException, ValueException {
      super();
      if (idComponent == null) {
        throw new UIException(
          UIUtils.getText("exception.ui.invalid" + typeComponent + "Id")
        );
      } else if (typeComponent == null) {
          throw new UIException(
            UIUtils.getText("exception.ui.invalidType")
          );
      } else if (positionX <= 0) {
          throw new ValueException(
            UIUtils.getText("exception.ui.invalidPositionX")
          );
      } else if (positionY <= 0) {
          throw new UIException(
            UIUtils.getText("exception.ui.invalidPositionY")
          );
      } else if (height <= 0) {
          throw new UIException(
            UIUtils.getText("exception.ui.invalidHeight")
          );
      } else if (width <= 0){
          throw new UIException(
            UIUtils.getText("exception.ui.invalidWidth")
          );
      } else {
          this.idComponent = idComponent;
          this.typeComponent = typeComponent;
          this.positionX = positionX;
          this.positionY = positionY;
          this.height = height;
          this.width = width;
          this.frame = frame;
        }
    }

    Component() {}

  public String getIdComponent () {
    return this.idComponent;
  }

  public void setIdComponent(String idPanel) {
    this.idComponent = idComponent;
  }

  public int getPositionX () {
    return this.positionX;
  }

  public void setPositionX(int positionX) {
    this.positionX = positionX;
  }

  public int getPositionY () {
    return this.positionY;
  }

  public void setPositionY(int positionX) {
    this.positionY = positionY;
  }

  public int getHeight () {
    return this.height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getWidth () {
    return this.width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public JFrame getFrameComponent(JFrame frame) {
    return this.frame;
  }
}
