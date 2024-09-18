// 性別
export const GENDERS = [
{ text: '不明', value: '0' },
{ text: '男性', value: '1' },
{ text: '女性', value: '2' }
] as const;

export type Gender = typeof GENDERS[number]['value'];