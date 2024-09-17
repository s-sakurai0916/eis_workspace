// 性別
export const GENDERS = [
{ text: '男性', value: 'male' },
{ text: '女性', value: 'female' },
{ text: 'その他', value: 'other' }
] as const;

export type Gender = typeof GENDERS[number]['value'];