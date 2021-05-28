import { Component, EventEmitter, Input, Output } from '@angular/core';
import { FormGroup } from '@angular/forms';

@Component({
  selector: 'app-button',
  templateUrl: './button.component.html',
  styles: [
  ]
})
export class ButtonComponent {

  @Input() type: string = '';
  @Input() estilo: string = '';
  @Input() desc: string = '';
  @Input() isDisabled: boolean = true;
  @Input() func!: () => void;
  @Input() parent!: FormGroup;

  @Output() onClick = new EventEmitter<any>();

  onClickButton(event:any) {
    this.onClick.emit(event);
  }
}
