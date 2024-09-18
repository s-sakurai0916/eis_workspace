export interface FormData {
  name: string;
  nameRuby: string;
  gender: string;
  address: string;
}

export interface Item extends FormData {
id: number;
}

export const defaultItem: Item = {
  id: 0,
  name: '',
  nameRuby: '',
  gender: '0',
  address: ''
};