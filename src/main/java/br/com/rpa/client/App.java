package br.com.rpa.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.RootPanel;

import br.com.rpa.client._ironelements.IronIcon;
import br.com.rpa.client._paperelements.PaperButton;
import br.com.rpa.client._paperelements.PaperCheckBox;
import br.com.rpa.client._paperelements.PaperCustomButton;
import br.com.rpa.client._paperelements.PaperDialog;
import br.com.rpa.client._paperelements.PaperFab;
import br.com.rpa.client._paperelements.PaperIconButton;
import br.com.rpa.client._paperelements.PaperInput;
import br.com.rpa.client._paperelements.PaperToast;
import br.com.rpa.client.ui.PolymerTest;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class App implements EntryPoint {
  /**
   * This is the entry point method.
   */
  @Override
  public void onModuleLoad() {
    // Creating a paper button.
    final PaperButton button = new PaperButton();
    button.setText("Paper button");
    button.setRaisedButton(true);
    assert button.getText().equals("Paper button");
    final PaperIconButton paperIconBtn = new PaperIconButton();
    paperIconBtn.setText("PaperIconBtn");
    paperIconBtn.setIcon("close");
    // assert paperIconBtn.getText().equals("PaperIconBtn");

    final PaperDialog dialog = new PaperDialog();
    dialog.setOpened(true);
    dialog.setHeading("Some heading");
    /* dialog.addParagraphContent("Some content"); */
    dialog.setHTML(new Image("http://lorempixel.com/500/200").getElement().getString());
    dialog.setLayered(true);
    final PaperButton dismissive = new PaperButton();
    dismissive.setText("close");
    final PaperButton ok = new PaperButton();
    ok.setIcon("done");
    ok.setText("Done");
    dialog.addActionButtons(dismissive, 0, ok);

    final PaperToast toast = PaperToast.wrap("toast");

    final PaperIconButton paperBtn = new PaperIconButton();
    paperBtn.setText("Icon btn");
    paperBtn.setRaisedButton(true);
    paperBtn.setIcon("menu");

    final PaperCheckBox checkbox = new PaperCheckBox();
    checkbox.setLabel("check box");

    final PaperFab fab = new PaperFab();
    fab.setIcon("menu");

    final PaperFab fabmini = new PaperFab();
    fabmini.setIcon("mail");
    fabmini.setMini(true);

    final PaperInput input = new PaperInput();
    input.setRequired(true);
    input.setLabel("Type something");

    // Getting the value of a paper button property.
    System.out.println(button.isRaisedButton());

    // Adding a event handler to the paper button.
    fab.addClickHandler(new ClickHandler() {
      @Override
      public void onClick(final ClickEvent event) {
        toast.setText("Test!!");
        toast.show();
      }
    });

    final PaperIconButton paperIconBtn2 = new PaperIconButton();
    paperIconBtn2.setIcon("folder");
    paperIconBtn2.setText("somelabel");
    // assert paperIconBtn2.getText().equals("somelabel");
    final IronIcon coreIcon = new IronIcon();
    coreIcon.setIcon("polymer");

    final IronIcon coreIconForCustom = new IronIcon();
    coreIconForCustom.setIcon("explore");

    final PaperCustomButton<IronIcon> customPaperBtn = new PaperCustomButton<IronIcon>(
        coreIconForCustom);
    customPaperBtn.setText("Custom");
    customPaperBtn.addClickHandler(new ClickHandler() {
      @Override
      public void onClick(final ClickEvent event) {
        toast.setText("It works!");
        toast.show();
      }
    });

    RootPanel.get().add(button);
    RootPanel.get().add(paperIconBtn);
    RootPanel.get().add(checkbox);
    RootPanel.get().add(dialog);
    RootPanel.get().add(paperBtn);
    RootPanel.get().add(input);
    RootPanel.get().add(fab);
    RootPanel.get().add(fabmini);
    RootPanel.get().add(paperIconBtn2);
    RootPanel.get().add(coreIcon);
    RootPanel.get().add(customPaperBtn);
    RootPanel.get().add(toast);

    // Creating uiBinder for polymer elements
    final PolymerTest uiPolymer = new PolymerTest("Teste");
    // FIXME: This text does not work because "label" is deprecated
    RootPanel.get().add(uiPolymer);

    final PaperFab fabWrapped = PaperFab.wrap(DOM.getElementById("rootfab"));
    fabWrapped.addClickHandler(new ClickHandler() {
      @Override
      public void onClick(final ClickEvent event) {
        toast.setText("Wrapped PaperFab");
        toast.show();
      }
    });
    fabWrapped.setMini(true);
  }
}
