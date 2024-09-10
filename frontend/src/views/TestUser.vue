<template>
  <v-container>
    <p class="text-h3">DataTable</p>
    <v-data-table
      v-model:items-per-page="itemsPerPage"
      :headers="headers"
      :items="pref"
      :items-per-page-options="pages"
      items-per-page-text="表示行数"
      class="elevation-1"
    ></v-data-table>
  </v-container>
</template>

<script>
export default {
  data () {
    return {

      itemsPerPage: 5,
      pages: [
        {value: 5, title: '5'},
        {value: 10, title: '10'},
        {value: 20, title: '20'},
        {value: -1, title: '$vuetify.dataFooter.itemsPerPageAll'}
      ],
      headers: [
        {
          title: '番号',
          align: 'end',
          sortable: false,
          key: 'no',
        },
        { title: '都道府県名', align: 'start', key: 'pref_jp' },
        { title: '英語名', align: 'start', key: 'pref_en' },
        { title: '面積(km2)', align: 'end', key: 'area' },
        { title: '人口(千人)', align: 'end', key: 'population' },
      ],
      pref: [
        {no: 1,pref_jp: "北海道",pref_en: "Hokkaido",area: 83457,population: 5400},
        {no: 2,pref_jp: "青森",pref_en: "Aomori",area: 9645,population: 1321},
        {no: 3,pref_jp: "岩手",pref_en: "Iwate",area: 15279,population: 1284},
        {no: 4,pref_jp: "宮城",pref_en: "Miyagi",area: 6862,population: 2328},
        {no: 5,pref_jp: "秋田",pref_en: "Akita",area: 11636,population: 1037},
        {no: 6,pref_jp: "山形",pref_en: "Yamagata",area: 6652,population: 1131},
        {no: 7,pref_jp: "福島",pref_en: "Fukushima",area: 13783,population: 1935},
        {no: 8,pref_jp: "茨城",pref_en: "Ibaraki",area: 6096,population: 2919},
        {no: 9,pref_jp: "栃木",pref_en: "Tochigi",area: 6408,population: 1980},
        {no: 10,pref_jp: "群馬",pref_en: "Gumma",area: 6362,population: 1976},
        {no: 11,pref_jp: "埼玉",pref_en: "Saitama",area: 3768,population: 7239},
        {no: 12,pref_jp: "千葉",pref_en: "Chiba",area: 5082,population: 6197},
        {no: 13,pref_jp: "東京",pref_en: "Tokyo",area: 2104,population: 13390},
        {no: 14,pref_jp: "神奈川",pref_en: "Kanagawa",area: 2416,population: 9096},
        {no: 15,pref_jp: "新潟",pref_en: "Niigata",area: 10364,population: 2313},
        {no: 16,pref_jp: "富山",pref_en: "Toyama",area: 2046,population: 1070},
        {no: 17,pref_jp: "石川",pref_en: "Ishikawa",area: 4186,population: 1156},
        {no: 18,pref_jp: "福井",pref_en: "Fukui",area: 4190,population: 790},
        {no: 19,pref_jp: "山梨",pref_en: "Yamanashi",area: 4201,population: 841},
        {no: 20,pref_jp: "長野",pref_en: "Nagano",area: 13105,population: 2109},
        {no: 21,pref_jp: "岐阜",pref_en: "Gifu",area: 9768,population: 2041},
        {no: 22,pref_jp: "静岡",pref_en: "Shizuoka",area: 7255,population: 3705},
        {no: 23,pref_jp: "愛知",pref_en: "Aichi",area: 5116,population: 7455},
        {no: 24,pref_jp: "三重",pref_en: "Mie",area: 5762,population: 1825},
        {no: 25,pref_jp: "滋賀",pref_en: "Shiga",area: 3767,population: 1416},
        {no: 26,pref_jp: "京都",pref_en: "Kyoto",area: 4613,population: 2610},
        {no: 27,pref_jp: "大阪",pref_en: "Osaka",area: 1901,population: 8836},
        {no: 28,pref_jp: "兵庫",pref_en: "Hyogo",area: 8396,population: 5541},
        {no: 29,pref_jp: "奈良",pref_en: "Nara",area: 3691,population: 1376},
        {no: 30,pref_jp: "和歌山",pref_en: "Wakayama",area: 4726,population: 971},
        {no: 31,pref_jp: "鳥取",pref_en: "Tottori",area: 3507,population: 574},
        {no: 32,pref_jp: "島根",pref_en: "Shimane",area: 6708,population: 697},
        {no: 33,pref_jp: "岡山",pref_en: "Okayama",area: 7010,population: 1924},
        {no: 34,pref_jp: "広島",pref_en: "Hiroshima",area: 8480,population: 2833},
        {no: 35,pref_jp: "山口",pref_en: "Yamaguchi",area: 6114,population: 1408},
        {no: 36,pref_jp: "徳島",pref_en: "Tokushima",area: 4147,population: 764},
        {no: 37,pref_jp: "香川",pref_en: "Kagawa",area: 1862,population: 981},
        {no: 38,pref_jp: "愛媛",pref_en: "Ehime",area: 5679,population: 1395},
        {no: 39,pref_jp: "高知",pref_en: "Kochi",area: 7105,population: 738},
        {no: 40,pref_jp: "福岡",pref_en: "Fukuoka",area: 4847,population: 5091},
        {no: 41,pref_jp: "佐賀",pref_en: "Saga",area: 2440,population: 835},
        {no: 42,pref_jp: "長崎",pref_en: "Nagasaki",area: 4106,population: 1386},
        {no: 43,pref_jp: "熊本",pref_en: "Kumamoto",area: 7268,population: 1794},
        {no: 44,pref_jp: "大分",pref_en: "Oita",area: 5100,population: 1171},
        {no: 45,pref_jp: "宮崎",pref_en: "Miyazaki",area: 6795,population: 1114},
        {no: 46,pref_jp: "鹿児島",pref_en: "Kagoshima",area: 9045,population: 1668},
        {no: 47,pref_jp: "沖縄",pref_en: "Okinawa",area: 2277,population: 1421}
      ],
    }
  }
}
</script>
