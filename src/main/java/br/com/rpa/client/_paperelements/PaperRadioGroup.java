package br.com.rpa.client._paperelements;

import java.util.Collection;

import com.google.gwt.core.client.Scheduler;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.view.client.ProvidesKey;
import com.google.gwt.view.client.SimpleKeyProvider;

import br.com.rpa.client._ironelements.IronSelector;
import br.com.rpa.client._ironelements.IronSelectorItemRenderer;

public class PaperRadioGroup<T> extends IronSelector<T> {

	public PaperRadioGroup() {
		this(new IronSelectorItemRenderer<T>() {
			@Override
			public Element render(T item) {
				final PaperRadioButton opt = new PaperRadioButton();
				String label = (item == null ? "" : item.toString());
				opt.setLabel(label);
				opt.setName(label);
				return opt.getElement();
			}
		}, new SimpleKeyProvider<T>());
	}

	public PaperRadioGroup(IronSelectorItemRenderer<T> itemRenderer,
			ProvidesKey<T> keyProvider){
		super(Document.get().createElement(PaperRadioGroupElement.TAG), itemRenderer, keyProvider);
	}

	@Override
	protected PaperRadioGroupElement getPaperElement() {
		return getElement().cast();
	}

	@Override
	protected void ensureDomEventHandlers() {

		addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {

				Scheduler.get().scheduleFixedDelay(new Scheduler.RepeatingCommand() {
					@Override
					public boolean execute() {
						int selectedOpt = -1;
						NodeList<Element> items = getPaperElement().getElementsByTagName(PaperRadioButtonElement.TAG);

						for(int k = 0, len = items.getLength(); k < len; k++){
							PaperRadioButtonElement item = (PaperRadioButtonElement) items.getItem(k);
							if(item.hasAttribute("checked")){
								selectedOpt = k;
								break;
							}
						}

						if(selectedOpt >= 0){
							setValue( values.get(selectedOpt), true );
							ValueChangeEvent.fire(PaperRadioGroup.this, getValue());
						}

						return false;
					}
				}, 500);

			}
		});
	}

	@Override
	public void setAcceptableValues(Collection<T> newValues) {
		super.setAcceptableValues(newValues);
		ensureDomEventHandlers();
	}

	@Override
	protected void updateSelection() {
		T value = getValue();

		if(value != null){
			getPaperElement().setSelected(null);
			PaperRadioButtonElement selectedOpt = null;
			NodeList<Element> items = getPaperElement().getElementsByTagName(PaperRadioButtonElement.TAG);

			for(int k = 0, len = items.getLength(); k < len; k++){
				PaperRadioButtonElement item = (PaperRadioButtonElement) items.getItem(k);
				item.setChecked(false);
				if(value.equals(item.getName())){
					selectedOpt = item;
				}
			}

			getPaperElement().setSelected(value.toString());
			if(selectedOpt != null){
				selectedOpt.setChecked(true);
			}
		}
	}

}
