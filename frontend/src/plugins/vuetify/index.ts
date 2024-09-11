import "vuetify/styles";
import { createVuetify } from "vuetify";
import '@mdi/font/css/materialdesignicons.css';
import 'vuetify/styles';
import { aliases, mdi } from 'vuetify/iconsets/mdi-svg';
import * as components from "vuetify/components";
import * as directives from "vuetify/directives";


const vuetify = createVuetify({
  components,
  directives,
  icons: {
      defaultSet: 'mdi',
      aliases,
      sets: {
          mdi,
      },
  }
});

export default vuetify;
