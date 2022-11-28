import { Box, Typography, useTheme ,Divider } from "@mui/material";
import FlexBetween from "components/FlexBetween";
import WidgetWrapper from "components/WidgetWrapper";

const AdvertWidget = () => {
  const { palette } = useTheme();
  const dark = palette.neutral.dark;
  const main = palette.neutral.main;
  const medium = palette.neutral.medium;

  return (
    <WidgetWrapper>
      <FlexBetween>
        <Typography color={dark} variant="h5" fontWeight="500">
          Sponsored
        </Typography>
        <Typography color={medium}>Create Ad</Typography>
      </FlexBetween>
      <img
        width="100%"
        height="auto"
        alt="advert"
        src="http://localhost:3001/assets/sports.webp"
        style={{ borderRadius: "0.75rem", margin: "0.75rem 0" }}
      />
      <FlexBetween>
        <Typography color={main}>Star SportsHD</Typography>
        <Typography color={medium}>starsports.com</Typography>
      </FlexBetween>
      <Typography color={medium} m="0.5rem 0">
      In this country, people love cricket, dream cricket, speak cricket and breathe it too.
      </Typography>

      <Divider marginTop="2rem"/>

      <Box marginTop={"2rem"}>
      <FlexBetween>
        <Typography color={dark} variant="h5" fontWeight="500">
          Live Streaming
        </Typography>
        <Typography color={medium}></Typography>
      </FlexBetween>
      <img
        width="100%"
        height="auto"
        alt="advert"
        src="http://localhost:3001/assets/live.jpg"
        style={{ borderRadius: "0.75rem", margin: "0.75rem 0" }}
      />
      <FlexBetween>
        <Typography color={main}>Star SportsHD</Typography>
        <Typography color={medium}>starsports.com</Typography>
      </FlexBetween>
      <Typography color={medium} m="0.5rem 0">
      Kabaddi is played in two formats viz, Circle Style Kabaddi and Standard style Kabaddi. Circle Style Kabaddi is mainly popular in the states of Haryana and Punjab, while Standard style is accepted and cherished throughout the world.
      </Typography>

      </Box>
    </WidgetWrapper>
  );
};

export default AdvertWidget;
